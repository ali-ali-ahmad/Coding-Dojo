const express = require('express');
const cors = require ('cors')
const app = express();

const server = app.listen(8000, () =>
    console.log('The server is all fired up on port 8000')
);

const io = require('socket.io')(server, { cors: true });

require('./config/mongoose.config');
app.use(cors());
app.use(express.json());
app.use(express.urlencoded({extended: true}));
const port = 8000;
require('./routes/player.routes')(app);

app.listen(port, ()=> console.log(`Listening on port : ${port}`));

io.on("connection", socket => {
    // console.log(socket.id);
    // socket.on("event_from_client", data => {
    //     socket.broadcast.emit("send_data_to_all_other_clients", data);
    // });
    socket.on("chat", data => {
        console.log(data);
        io.emit("caht", data)
    })
});