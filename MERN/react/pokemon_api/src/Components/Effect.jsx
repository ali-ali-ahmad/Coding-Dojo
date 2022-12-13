import React, { useState } from "react";

const Effect = () => {
    let [pokemon, setPokemon] = useState([]);
    let [loaded, setLoaded] = useState(false);


    const getPokemon = ()=>{
        fetch('https://pokeapi.co/api/v2/pokemon')
        .then(response => response.json())
        .then(response => setPokemon(response.results), setLoaded(true))
        .catch((err) => {
            console.log(err.message);
        });
    }

        // useEffect(() => {
        //     fetch('https://pokeapi.co/api/v2/pokemon')
        //     .then(response => response.json())
        //     .then(response => setPokemon(response.results), setLoaded(true))
        //     .catch((err) => {
        //         console.log(err.message);
        //     });
        // }, []);
    
    
    return (
    <div>
        <input type="submit" onClick={getPokemon} value="Get Pokemon"/>
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
export default Effect;



