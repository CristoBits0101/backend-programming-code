# OPCIÓN 1

import React, { useEffect } from "react";

useEffect(() => 
  {
    fetch("https://api.example.com/data")
      .then((response) => response.json())
      .then((json) => setData(json))
      .catch((error) => console.log(error));
  }, 
  []
);