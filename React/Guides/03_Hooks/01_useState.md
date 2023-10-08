# PASO 1) IMPORTAR HOOKS

import {useState} from 'react'

# PASO 2) DECLARAR HOOKS

// Asignamos y un valor inicial a la variable que contiene el valor estado.
// El valor se modifica a través de la función.
const [isFollowing, setIsFollowing] = useState(false)

# PASO 3) CAMBIAR EL VALOR A LAS PROPS CAMBIANDO EL ESTADO

// Le pasamos a la función el valor contrario de la variable isFollowing para que modifique la variable.
const changeContentStyle = () => {
  setIsFollowing(!isFollowing)      
}

<button className={buttonClassName} onClick={changeContentStyle}>
  {text}
</button>

## OR

<button className={buttonClassName} onClick={() => setName('Cristo')}>
  {text}
</button>