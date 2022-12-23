const PlayerController = require ('../controllers/player.controller');
module.exports = function(app){
    app.post('/api/players', PlayerController.createPlayer);
    app.get('/api/players', PlayerController.getAllPlayers);
    app.get('/api/players/:id', PlayerController.getPlayer);
    app.put('/api/players/:id', PlayerController.updatePlayer);
    app.put('/api/players/status/:id', PlayerController.setPlayerStatus);
    app.delete('/api/players/:id', PlayerController.deletePlayer);
}



