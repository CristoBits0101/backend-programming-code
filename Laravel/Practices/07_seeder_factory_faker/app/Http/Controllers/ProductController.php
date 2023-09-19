<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Contracts\View\View;
use App\Models\Product;

class ProductController extends Controller
{
    //
    public function index():View
    {
        $products = Product::all();
        return view('product.index', compact('products'));
    }
}
