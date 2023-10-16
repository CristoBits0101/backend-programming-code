# PASO 1) 

npm install react-router-dom@latest

# PASO 2) 

main.jsx:

import { BrowserRouter } from 'react-router-dom'

ReactDOM.render(
  <BrowserRouter>
    <App />
  </BrowserRouter>
)

# PASO 3) 

App.jsx: 

import { Routes, Route, Link } from "react-router-dom";

function App() {

    return (
        <header>
            <nav>
                <ul>
                    ## Creación de link.
                    <li><Link to='/'>Home</li>
                </ul>
            </nav>
        </header>
        <>
            <Routes>
                ## Creación de ruta.
                <Route path="/" element={<Home />} />
            </Routes>
        </>
    )

}