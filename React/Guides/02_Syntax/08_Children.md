# OPCIÓN 1)

const App = () => {
  return  <MyComponent> 
            Pasando un valor a un elemento del componente mediante la prop reservada children 
          </MyComponent>;
};

const MyComponent = ({children}) => {
  return <div className={twitter-style}>children</div>
};

# OPCIÓN 2)

const App = () => {
  return  <MyComponent> 
            <h1>Pasando un elemento a un elemento del componente mediante la prop reservada children </h1>
          </MyComponent>;
};

const MyComponent = ({children}) => {
  return <div className={twitter-style}>{children}</div>
};

# OPCIÓN 3)

const App = () => {
  return  <MyComponent> 
            <h1>Pasando varios elementos a un elemento del componente mediante la prop reservada children </h1>
          </MyComponent>;
};

const MyComponent = ({children}) => {
  return <div className={twitter-style}>{children}</div>
};

# OPCIÓN 4)

const App = () => {
  return  <MyComponent> 
            <MyComponent2 /> 
          </MyComponent>;
};

const MyComponent = ({children}) => {
  return <div className={twitter-style}>{children}</div>
};
