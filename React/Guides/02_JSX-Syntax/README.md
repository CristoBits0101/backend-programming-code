# 1. CREAR UN COMPONENTE

const MyComponent = () => {
  return ();
};

# 2. EXPORTAR UN COMPONENTE

const MyComponent = () => {
  return ();
};

export default MyComponent;

# 3. IMPORTAR UN COMPONENTE

import MyComponent from './MyComponent';

# 4. IMPORTAR UN COMPONENTE CON OTRO NOMBRE

import { Button as MyButton } from './Button';

# 5. AÑADIR UN ELEMENTOS A UN COMPONENTE

const MyComponent = () => {
  return <div></div>
};

# AÑADIR ELEMENTOS A UN COMPONENTE

const MyComponent = () => {
  return (
    <div>
      <h1>Hola mundo</h1>
      <p>Esto es un párrafo.</p>
    </div>
  );
};


# PASAR PROPS A UN COMPONENTE

const MyComponent = ({ name }) => {
  return <h1>Hola, {name}</h1>;
};

# AÑADIR A LAS PROPS UN VALOR MEDIANTE DECLARACIONES

const App = () => {
  return <MyComponent name="Juan" />;
};

# AÑADIR A LAS PROPS UN VALOR MEDIANTE EXPRESIONES

