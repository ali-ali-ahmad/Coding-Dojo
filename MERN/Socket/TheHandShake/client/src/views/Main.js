import React, {useState, useEffect} from 'react'
import axios from 'axios';
import PlayerList from '../components/PlayerList';
import AddPlayer from './AddPlayer';
import TabPanel from '../components/TabPanel';
import './css/main.css'
import {Tabs, Tab, Box } from '@mui/material';
// import SwipeableViews from 'react-swipeable-views';


function a11yProps(index) {
    return {
    id: `simple-tab-${index}`,
    'aria-controls': `simple-tabpanel-${index}`,
    };
}


const Main = (props) => {
    const [players, setPlayers] = useState();
    const [loaded, setLoaded] = useState(false);

    const [value, setValue] = useState(0);

    const handleChange = (event, newValue) => {
        setValue(newValue);
    };

    useEffect (() =>{
        axios.get('http://localhost:8000/api/players')
            .then(res => {
                setPlayers(res.data);
                setLoaded(true);
            })
            .catch(err => console.error(err));
    }, []);

    const removeFromDom = playerId => {
        setPlayers(players.filter(player => player._id !== playerId));
    }

    return (
        <>
            <Box sx={{ width: '100%' }}>
                <Box sx={{ borderBottom: 1, borderColor: 'divider' }}>
                    <Tabs value={value} onChange={handleChange} aria-label="basic tabs example">
                        <Tab label="Players List" {...a11yProps(0)} />
                        <Tab label="Add Player" {...a11yProps(1)} />
                    </Tabs>
                </Box>
                <TabPanel value={value} index={0}>
                    {loaded && <PlayerList players={players} removeFromDom={removeFromDom}/>}
                </TabPanel>
                <TabPanel value={value} index={1}>
                    <AddPlayer/>
                </TabPanel>
            </Box>
        </>
    )
};

export default Main;



