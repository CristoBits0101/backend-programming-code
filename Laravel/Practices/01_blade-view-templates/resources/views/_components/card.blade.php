<div style="border: 1px solid black">
    <h3>{{ $title }}</h3>
    <p>{{ $content }}</p>
    <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="w-6 h-6" width="100" height="100">
        <path stroke-linecap="round" stroke-linejoin="round" d="M4.5 19.5l15-15m0 0H8.25m11.25 0v11.25" />
    </svg>
    <!-- asset es para indicarle a Laravel la ruta correcta por que si lo hacemos directamente añade como directorio padre la de la URL de la página -->
    <img src="{{ asset('asset\img\281764.png') }}" alt="example" width="100px" height="100px">
</div>
