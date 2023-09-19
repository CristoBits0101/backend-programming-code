<?php

    /**
     *  setcookie 
     * (
     *      string $name                [, 
     *          string $value = ""          [, 
     *              int $expires = 0            [, 
     *                  string $path = ""           [, 
     *                      string $domain = ""         [, 
     *                          bool $secure = FALSE        [, 
     *                              bool $httponly = FALSE
     *                                                      ]
     *                                                  ]
     *                                              ]
     *                                          ]
     *                                      ]
     *                                  ] 
     *  ) : bool
     */

    /**
     *  - Definición normal de una cookie.
     *  - 86400s === 1 día.
     */
    setCookie($name, $value, $expire, $path, $domain, $secure, $httponly);
    setcookie("Idioma", "Español", time() + 86400);
    setcookie("Usuario", "yeray1", time() + 3600);

    /**
     *  - Para poder usar las cookies seguras se deben configurar las variables en php.ini
     *  - Si no se tiene acceso se pueden configurar a través de php.
     */
    ini_set('session.cookie_httponly',1);
    ini_set('session.use_only_cookies',1);
    ini_set('session.cookie_secure', 1);

    /**
     *  - Definición desde un dominio personalizado.
     *  - Solo puede ser visto desde el dominio ejemplo.com o 192.168.0.2...
     */
    setCookie($name, $value, $expire, $path, $domain, $secure, $httponly);
    setcookie("UsuarioDominio1", "yerayDomain", time() + 3600, "/", "www.ejemplo.com", 0, 0);
    setcookie("UsuarioDominio2", "yerayDomain", time() + 3600, "/", "192.168.11.206", 0, 0);

    // Definición de una variable http only
    setCookie($name, $value, $expire, $path, $domain, $secure, $httponly);
    setcookie("UsuarioHttpOnly", "yeray2", time() + 3600, "/", "", 0, 1);

    // Definición de una variable segura mediante https
    setCookie($name, $value, $expire, $path, $domain, $secure, $httponly);
    setcookie("UsuarioSeguroHttps", "yeray3", time() + 3600, "/", "", 1, 0);

    var_dump($_COOKIE);

?>