<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use App\Models\User;
use Illuminate\Support\Facades\Hash;

class UserSeeder extends Seeder
{
    /**
     * Run the database seeds.
     */
    public function run(): void
    {
        user::create([
            'name' => 'example',
            'email' => 'example@example.com',
            'password' => Hash::make('12345678'),
        ]);

        user::create([
            'name' => 'example2',
            'email' => 'example2@example.com',
            'password' => Hash::make('5745653'),
        ]);

        user::create([
            'name' => 'example3',
            'email' => 'example3@example.com',
            'password' => Hash::make('87976954'),
        ]);

        user::create([
            'name' => 'example4',
            'email' => 'example4@example.com',
            'password' => Hash::make('4365347'),
        ]);
    }
}
