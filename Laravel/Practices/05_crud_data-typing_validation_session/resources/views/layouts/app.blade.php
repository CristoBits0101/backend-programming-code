<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
</head>
<body>

    <!-- include permite coger código -->
    @include('layouts._partials.messages')

    <!-- yield permite dejar código -->
    @yield('content')

</body>
</html>