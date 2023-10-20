# PASO 1)

## IMPORTAR REDUCER

import { useReducer, useRef } from 'react'

# PASO 2)

## CREAR COMPONENTE

const ListaTareas = () => {
  return (
    <div>
      <h1>Lista de Tareas</h1>
      <form>
        <label for="tittle">Tarea</label>
        <input type="text" name="tittle" />
        <input type="submit" name="" value="enviar" />
      </form>
    </div>
  )
}

## AÑADIR REDUCER Y REF

## Sirve para obtener referencia de los elementos.
const inputRef = useRef()

const ListaTareas = () => {
  ## Devuelve un array con 2 posiciones.
  ## El estado y la modificación del estado.
  ## tasks = tareas.
  ## dispatch = función para modificar tareas.
  ## El valor inicial de state puede ser un objeto, una string etc...
  ## Action recibe los valores del dispatch
  const [tasks, dispatch] = useReducer(state = [], action) => {
    switch (action.type) {
      case 'add_task': {
        return [
          ..state
          { 
            id: state.length, 
            title: action.title
          }
        ]
      case 'remove_task': {
        // Añade un nuevo array al state con las tareas que sean diferentes a las del actión index que le estamos pasando :S
        return state.filter((task, index) => {index !== index})
      }
      default
        return state;
    }
  }

  ## Recibe como parámetro el propio evento por que estaba encanchada al onSubmit.
  const handlerSubmit = (event) => {
    // El evento que se capturó de onSubmit, prevenimos su comportamiento por default.
    event.preventDefault();
    // Ahora le indico que va a realizar en su lugar.
    // En este caso un evento sobre useReducer para modificar la lista de tareas.
    // Llamamos la función modificadora del userReducer.
    // Le pasamos un objeto.
    dispatch({
      type: 'add_task'
      title: inputRef.current.value
    })
  }

  return (
    <div>
      <h1>Lista de Tareas</h1>
      // onSubmit envía el contenido del formulario al propio entorno de React o JS.
      // onSubmit se envía la función handleSubmit sin ejecutar.
      <form onSubmit={handleSubmit}>
        <label for="tittle">Tarea</label>
        // La referencia del input apunta el inputRef de arriba.
        <input type="text" name="tittle" ref={inputRef}/>
        <input type="submit" name="" value="enviar" />
      </form>
      <div className="task">
        // Solo modificamos el array de tareas cuando exista el array de tareas.
        // Dentro de cada tarea recuperamos su indice.
        {tasks && tasks.map((task, index) =>{
          <div key={index}>
            <p>{task.tittle}</p>
            <button onclick={()=>{dispath{type: 'remove_task', index: index}}}>Borrar</button>
          </div>
        })}
      </div>
    </div>
  )
}