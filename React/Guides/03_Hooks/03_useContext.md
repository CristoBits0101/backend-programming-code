# PASO 1)

## IMPORTAR DEPENDENCIA

import { createContext } from ./counterContext';
import { useState } from 'react';

## CREAR CONTEXT

const counterContext = createContext()

## EXPORTAR CONTEXT

export default counterContext



# PASO 2)

## IMPORTAR CONTEXT

import {counterContext } from 'react';

## CREAR COMPONENTE

const StateCompo = ({ children }) => {

  const [counter, setCounter] = useState(0)

  const increment = () => {
    setCounter(prev => prev + 1)
  }

  const decrement = () => {
    setCounter(prev => prev - 1)
  }

  const reset = () => {
    setCounter(0)
  }

  ## COMPARTIMOS

  ### Provider = Proveedor
  ### value    = Los elementos envueltos dentro de counterContext tienen acceso a los value.
  return (
    <counterContext.Provider value={{ counter, increment, decrement, reset }}>
      {children}
    </counterContext.Provider>
  )

}



# PASO 3)

## IMPORTAR COMPONENTE EN APP

import {StateCompo} from './context/stateCompo'

## ENVOLVER LA APLICACIÓN

<>
  <StateCompo>
    <Routes>
      <Route path="/" element={<Home />} />
    </Routes>
  </StateCompo>
</>



# PASO 4)

## AÑADIR EL CONTEXTO AL COMPONENTE

import {useContext} from 'react'
import counterContext from './context/counterContext'

const Header = ({children}) => {
  const {counter, increment} = useContext(counterContext)
  return (
    <div>{children}</div>
    HEADER
    <h4>{Counter}</h4>
    <button onClick{{() = {increment}}}>Incrementar</button>
  )
}