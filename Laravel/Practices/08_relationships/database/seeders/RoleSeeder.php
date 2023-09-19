<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use App\Models\Role;
use Illuminate\Support\facades\DB;

class RoleSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        //
        Role::create([
            'id' => 1,
            'name' => 'admin'
        ]);

        //
        Role::create([
            'id' => 2,
            'name' => 'staff'
        ]);

        //
        Role::create([
            'id' => 3,
            'name' => 'user'
        ]);

        //
        Role::create([
            'id' => 4,
            'name' => 'guest'
        ]);

        // Esta es la tabla con las claves foráneas.
        DB::table('role_user')->insert([
            'role_id' => 1,
            'user_id' => 1,
            'added_by' => 'juanjo',
        ]);

        DB::table('role_user')->insert([
            'role_id' => 2,
            'user_id' => 1,
            'added_by' => 'Ayose',
        ]);

        DB::table('role_user')->insert([
            'role_id' => 1,
            'user_id' => 2,
            'added_by' => 'Pepa',
        ]);

        DB::table('role_user')->insert([
            'role_id' => 3,
            'user_id' => 2,
            'added_by' => 'Juanjo',
        ]);

        DB::table('role_user')->insert([
            'role_id' => 4,
            'user_id' => 3,
            'added_by' => 'María',
        ]);
    }
}
