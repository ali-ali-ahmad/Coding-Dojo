import React, { useState } from "react";
import axios from 'axios';

const PokemoneAPI = () => {
    let [pokemon, setPokemon] = useState([]);
    let [loaded, setLoaded] = useState(false);

    const getPokemon = ()=>{
        axios.get('https://pokeapi.co/api/v2/pokemon')
        .then(response => setPokemon(response.data.results), setLoaded(true))
        .catch((err) => {
            console.log(err.message);
        });
    }
    
    return (
    <div>
        <input type="submit" onClick={getPokemon}  value="Get Pokemon"/>
        {loaded?
        <div>
            {pokemon.map((poke, index)=>{
                return (<div key={index}>{poke.name}</div>)
            })}
        </div>:null
        }
    </div>
    );
}
export default PokemoneAPI;



