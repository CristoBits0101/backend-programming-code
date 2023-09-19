<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;

class NoteRequest extends FormRequest
{
    /**
     * Determine if the user is authorized to make this request.
     */
    public function authorize(): bool // true if the user is authorized to make this request
    {
        // return false;
        return true;                  // true porque es un crud permitido a cualquiera. 
    }

    /**
     * Get the validation rules that apply to the request.
     *
     * @return array<string, \Illuminate\Contracts\Validation\ValidationRule|array|string>
     */
    public function rules(): array  // retorna el array con las reglas validas.
    {
        return [
            'title' => 'required | max:255 | min:3',
            'description' => 'required | max:255 | min:3'
        ];
    }
}
