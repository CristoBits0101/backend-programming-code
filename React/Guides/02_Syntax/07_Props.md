# OPCIÓN 1)

const MyComponent = ({name = "Cristo"}) => {
  return <div className={user-style}>{name}</div>
};

# OPCIÓN 2)

const App = () => {
  return <MyComponent name="Juan" />;               
};

const MyComponent = ({ name, age, color }) => {
  return <h1>Hola, {name}</h1>;
};

# OPCIÓN 3)

const App = () => {
  const name = "Juan";
  return <MyComponent name={name} />;              
};

const MyComponent = ({ name, age, color }) => {
  return <h1>Hola, {name}</h1>;
};

# OPCIÓN 4)

const App = () => {
  return <MyComponent color={['yellow', 'red']} />;
};

const MyComponent = ({ name, age, color }) => {
  return <h1>Hola, {color[0]}</h1>;
};

# OPCIÓN 5)

const object = {isFollowing: true, userName: "Cristo"}

const App = () => {
  return <MyComponent {...object} />;
};

const MyComponent = ({ object }) => {
  return <h1>Hola, {object.userName}</h1>;
};
