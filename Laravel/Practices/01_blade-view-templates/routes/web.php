<?php

use Illuminate\Support\Facades\Route;

// Route::view('url-a-asociar', 'vista-a-asociar')->('nombre-de-ruta-a-asociar').
// Páginas estáticas que componen la web: Home, Service...
Route::view('/', 'page-1_home')->name('home');
