<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>index</title>
</head>
<body>
    <h1>{{ $user->name }}</h1>
    <h2>{{ $user->email }}</h2>
    <h2>
        Prefix: {{ $user->phone->prefix }}
        <br>
        Phone: {{ $user->phone->phone_number }}
    </h2>
</body>
</html>