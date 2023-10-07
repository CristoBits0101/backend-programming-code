# 1. CREAR UN COMPONENTE

const MyComponent = () => {
  return ();
};

## OR

function MyComponent() {
  return ();
}



# 2. EXPORTAR UN COMPONENTE

export default MyComponent;

## OR

export function MyComponent() {
  return ();
}



# 3. IMPORTAR UN COMPONENTE

import MyComponent from './MyComponent';

## OR

import { Button as MyButton } from './Button';



# 4. AÑADIR ELEMENTOS A UN COMPONENTE

const MyComponent = () => {
  return <div></div>
};

## OR

const MyComponent = () => {
  return (
    <div>
      <h1>Hola mundo</h1>
      <p>Esto es un párrafo.</p>
    </div>
  );
};



# 5. PASAR PROPS A UN ELEMENTO DE UN COMPONENTE

const MyComponent = ({ name, age, color }) => {
  return <h1>Hola, {name}</h1>;
};



# 6. PASAR DATOS A LAS PROPS

// Declaración.
const App = () => {
  return <MyComponent name="Juan" />;               
};

## OR

 // Expresión.
const App = () => {
  const name = "Juan";
  return <MyComponent name={name} />;              
};

## OR

const App = () => {
  return <MyComponent number={[1, 2, 3]} />;
};

## OR

const object = {isFollowing: true, userName: "Cristo"}

const App = () => {
  return <MyComponent {...object} />;
};




# 7. AÑADIR IDENTIFICADORES A LOS ELEMENTOS

const MyComponent = () => {
  return <div id="123"></div>
};

## OR

const MyComponent = () => {
  return <div className="container"></div>
};

## OR

const MyComponent = () => {
  return <div className={twitter-style}></div>
};



# 8. AÑADIR UNA CHILDREN

const App = () => {
  return  <MyComponent> 
            Pasando un valor a un elemento del componente mediante la prop reservada children 
          </MyComponent>;
};

const MyComponent = ({children}) => {
  return <div className={twitter-style}>children</div>
};

## OR

const App = () => {
  return  <MyComponent> 
            <h1>Pasando un elemento a un elemento del componente mediante la prop reservada children </h1>
          </MyComponent>;
};

const MyComponent = ({children}) => {
  return <div className={twitter-style}>{children}</div>
};

## OR

const App = () => {
  return  <MyComponent> 
            <h1>Pasando varios elementos a un elemento del componente mediante la prop reservada children </h1>
          </MyComponent>;
};

const MyComponent = ({children}) => {
  return <div className={twitter-style}>{children}</div>
};

## OR

const App = () => {
  return  <MyComponent> 
            <MyComponent2 /> 
          </MyComponent>;
};

const MyComponent = ({children}) => {
  return <div className={twitter-style}>{children}</div>
};

# 9. DEFINIR UN VALOR BASE A LA PROP POR SI NO NOS LLEGAN DATOS

const MyComponent = ({name = "Cristo"}) => {
  return <div className={user-style}>{name}</div>
};

# 10. AÑADIR IMAGENES A LOS COMPONENTES

const MyComponent = ({name = "Cristo"}) => {
  return (
    <img alt="fotoEstática" src="./img/Cristo.png">
  )
};

## OR

const MyComponent = ({name = "Cristo"}) => {
  return (
    <img alt="fotoDinámica" src={`https://google/img/${img}`}>
  )
};

## OR

const imgUrl = `https://google/img/${img}`;

<img alt="fotoDinámica" src={imgUrl}>

# 11. RENDERIZADO CONDICIONAL

const isfollowing = true

const text = isfollowing 
  ? 'Siguiendo' 
  : 'Seguir'

const buttonClassName = isfollowing 
  ? 'styleLight is-following'
  : 'styleBlack'