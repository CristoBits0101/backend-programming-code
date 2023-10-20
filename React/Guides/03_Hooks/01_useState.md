# PASO 1) IMPORTAR STATE

import { useState } from 'react'

# PASO 2) DECLARAR STATE

const [name, setName] = useState("")

# PASO 3) MODIFICAR STATE

<button onClick={() => setName("Cristo")}>

# PASO 4) IMPRIMIR STATE

<h1>{name}</h1>