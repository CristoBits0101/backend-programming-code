# OPCIÓN 1)

const MyComponent = ({name = "Cristo"}) => {
  return (
    <img alt="fotoEstática" src="./img/Cristo.png">
  )
};

# OPCIÓN 2)

const MyComponent = ({name = "Cristo"}) => {
  return (
    <img alt="fotoDinámica" src={`https://google/img/${img}`}>
  )
};

# OPCIÓN 3)

const imgUrl = `https://google/img/${img}`;

<img alt="fotoDinámica" src={imgUrl}>
