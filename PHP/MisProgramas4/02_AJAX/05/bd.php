<?php

function cargar_productos() {

    $producto1 = array("CodProd" => 1, "Nombre" => 'Harina', "Descripcion" => '8 paquetes de 1kg de harina cada uno', "Peso" => 8, "Stock" => 100, "CodCat" => 1, "Imagen" => "img/producto1.jpg");
    $producto2 = array("CodProd" => 2, "Nombre" => 'Azúcar', "Descripcion" => '20 paquetes de 1kg cada uno', "Peso" => 20, "Stock" => 3, "CodCat" => 1, "Imagen" => "img/producto2.jpg");
    $producto3 = array("CodProd" => 3, "Nombre" => 'Agua 1.5', "Descripcion" => '20 botellas de 1.5 litros cada una', "Peso" => 31, "Stock" => 50, "CodCat" => 2, "Imagen" => "img/producto3.jpg");
    $producto4 = array("CodProd" => 4, "Nombre" => 'Cerveza Alhambra tercio', "Descripcion" => '24 botellas de 33cl', "Peso" => 10, "Stock" => 0, "CodCat" => 3, "Imagen" => "img/producto4.jpg");

    return array($producto1, $producto2, $producto3, $producto4);
}