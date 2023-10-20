import React, { useRef } from 'react';

function App() {
  // Creamos una referencia llamada inputRef
  // y la inicializamos con el valor null.
  const inputRef = useRef(null);

  // Definimos una función llamada focusInput.
  // Cuando esta función se llama, enfocará el elemento de entrada.
  const focusInput = () => {
    // Usamos la referencia inputRef para acceder al elemento de entrada del DOM
    // y llamamos al método focus() para enfocar el elemento.
    inputRef.current.focus();
  };

  return (
    <div>
      {/* Creamos un elemento de entrada de texto (input) y asignamos la referencia
         inputRef al elemento utilizando el atributo ref. Esto establece la conexión
         entre la referencia y el elemento del DOM. */}
      <input ref={inputRef} type="text" />

      {/* Creamos un botón que, al hacer clic en él, llama a la función focusInput.
         Esto activará el enfoque en el campo de entrada de texto. */}
      <button onClick={focusInput}>Enfocar el campo de entrada</button>
    </div>
  );
}

export default App;
