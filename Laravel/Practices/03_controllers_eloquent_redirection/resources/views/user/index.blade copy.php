<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hello World!</title>
</head>
<body>

    <h1>User list:</h1>

    @forelse($users as $user)
        <li>Edad: {{$user->age}} years old</li>
    @empty
        <li>List empty.</li>
    @endforelse

</body>
</html>
