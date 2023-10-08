# OPCIÓN 1)

const isfollowing = true

const text = isfollowing 
  ? 'Siguiendo' 
  : 'Seguir'

const buttonClassName = isfollowing 
  ? 'styleLight is-following'
  : 'styleBlack'



# OPCIÓN 2)

<section className="participantes">       // Elemento en el que vamos a renderizar elementos.
  {                                       // Abrimos llaves para introducir código mediante expresiones.
    users.map(                            // Mapeamos la lista de usuarios.
      user => {                           // Almacenamos los valores de cada posición de la lista en la variable user.
        const [userId, userEmail] = user  // Extraemos los datos del objeto de la posición en variables independientes.
        return (                          // Retornamos el componente añadiendo a las props los valores del objeto.
          <TwitterFollowCard  
            key={userId}                  // Añadimos una clave única para ayudar a React a identificar elementos en la lista.
            userId={userId}
            userEmail={userEmail}
          >
            {name}
          </TwitterFollowCard>
        )
      }                      
    )
  }
</section>