<?php
    /*
        X1 -> php artisan view:clear    : Limpia el cache para cargar la nueva vista.
    */
    /*
        00 -> Restore vendor folder     : composer install
        01 -> New project               : composer create-project laravel/laravel project's-name or 
              laravel new project       : composer global require laravel/installer | laravel new project's-name 
        02 -> Start serve               : php artisan serve
        03 -> List routes               : php artisan route:list
    */
    /*
        04 -> Create migrate model      : php artisan make:migration create_table-name_table
        05 -> Update migrate model      : php artisan make:migration update_table-name_table -> Cuando no se puede rollback se actualiza.
        06 -> Data model migration      : php artisan migrate
        07 -> Undo last migration       : php artisan migrate:rollback
        08 -> Undo x migration          : php artisan migrate:rollback --batch=1 or 2 or 3   -> Son los números del lote migrado.
        09 -> Undo all migration        : php artisan migrate:reset
        10 -> Undo all + migration      : php artisan migrate:refresh
    */
    /*
        11 -> Create data model         : php artisan make:model Note                        -> Singular-Table-Name
        12 -> Create model-migration    : php artisan make:model Author --migration          -> model "Author" - migration "authors"
    */
    /*
        13 -> Create controller         : php artisan make:controller ControllerName
        14 -> Create controller resource: php artisan make:controller NameController --resource
    */
    /*
        15 -> Create request validation : php artisan make:request NoteRequest
        16 -> Create a new resource     : php artisan make:resource NoteResource
    */
    /*
        17 -> Create a seeder           : php artisan make:seeder ProductSeeder
        18 -> Run seeders               : php artisan db:seed
        19 -> Run a seeder              : php artisan db:seed --class=NameSeeder
    */
    /*
        20 -> Create a factory          : php artisan make:factory ProductFactory
    */
    /*
        21 -> Create a table of keys    : php artisan make:migration create_a_b_c_table (La tabla debe contener el nombre de las entidades en orden alfabético).
    */
    /*
        22 -> Create a middleware       : php artisan make:middleware Example
    */
    /*
        23 -> Add library Breeze        : composer require laravel/breeze --dev
              command breeze install 1  : php artisan breeze:install                (blade).
              command breeze install 2  : php artisan breeze:install react          (Inertia).
              command breeze install 3  : php artisan breeze:install blade vue      (Inertia).
              command breeze install 4  : php artisan breeze:install react api      (Next).
              server side rendering     : php artisan breeze:install react --ssr    (+SEO | -Speed).
    */
    /*
        24 -> Install node modules      : npm install
        25 -> Start a local server      : npm run dev
    */
    /*
        26 -> Add library Jetstream     : composer require laravel/jetstream -> Entorno frontal de la parte de Laravel.
              Install Jetstream Livewire: php artisan jetstream:install livewire
              Install Jetstream Inertia : php artisan jetstream:install inertia
              with team manager livewire: php artisan jetstream:install livewire --teams -> Admite --ssr
              with team manager inertia : php artisan jetstream:install inertia --teams  -> Admite --ssr
    */
    /*
        27 -> Install Livewire          : composer require livewire/livewire
        28 -> Create element Livewire   : php artisan make:livewire "name"
    */
    /*
        29 -> Uncomment the extension=zip line in php.ini by removing the initial semicolon.

        30 -> Install charts            : composer require consoletvs/charts
        31 -> Config charts             : php artisan vendor:publish --tag=charts_config

        32 -> Clean errors:
                php artisan config:clear
                php artisan clear-compiled
                php artisan optimize
                composer dump-autoload
    */
    /*
        33 -> ChangeView                : php artisan make:command ChangeView
        34 -> Storage link to public    : 
                php artisan storage:link
                cmd /c mklink /D C:\Workspace\A6.5-A6.6\public\storage C:\Workspace\A6.5-A6.6\storage
    */
    
?>