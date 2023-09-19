<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>index</title>
</head>
<body>
    
    <h1><?php echo e($user->name); ?> Roles:</h1>
    <?php $__currentLoopData = $user->roles; $__env->addLoop($__currentLoopData); foreach($__currentLoopData as $role): $__env->incrementLoopIndices(); $loop = $__env->getLastLoop(); ?>
        <ol>
            <li>
                Role: <?php echo e($role->name); ?>

                <br>
                Added_by: <?php echo e($role->pivot->added_by); ?>

            </li>
        </ol>
    <?php endforeach; $__env->popLoop(); $loop = $__env->getLastLoop(); ?>
</body>
</html>
<?php /**PATH C:\Users\reuda\Documents\code-exercises-hub\Laravel\08_relationships\resources\views/index.blade.php ENDPATH**/ ?>