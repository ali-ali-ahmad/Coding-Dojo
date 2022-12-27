const express = require('express');
const app = express();

const server = app.listen(8000, () =>
    console.log('The server is all fired up on port 8000')
);

const io = require('socket.io')(server, { cors: true });


io.on("connection", socket => {
    console.log(socket.id);
    console.log("Nice to meet you. (shake hand)")
    socket.on("event_from_client", data => {
        socket.emit("send_data_to_all_other_clients", data);
    });
    // socket.on("chat", data => {
    //     console.log(data);
    //     io.emit("caht", data)
    // })
});