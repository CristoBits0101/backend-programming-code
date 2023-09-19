/**
 *  1. Add type modules and start node index js to package.json
 *  2. Install axios coping code from the website npm axios.
 *  3. You can call apis with axios. 
 */
import axios from 'axios';

axios.get('https://pokeapi.co/api/v2/pokemon/pikachu')

.then(function (response) 
{
    // Handle success
    console.log(response.data);
})

.catch(function (error) 
{
    // Handle error.
    console.log(error);
})