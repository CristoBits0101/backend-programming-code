<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product</title>
</head>
<body>
    @forelse($products as $product)
        <li><h3>{{ $product->name }}</h3></li>
        <p>{{ $product->info }}</p>
        <p>{{ $product->price }} USD</p>
    @empty
        <h5>No data.</h5>
    @endforelse
</body>
</html>