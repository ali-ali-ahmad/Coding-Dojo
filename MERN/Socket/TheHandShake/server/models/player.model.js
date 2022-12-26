const mongoose = require('mongoose');
const PlayerSchema = new mongoose.Schema({
    name: {
        type: String,
        minlength:3,
        required: true,
    },
    position: {
        type: String
    }
}, {timestamps: true});
module.exports.Player = mongoose.model('Player', PlayerSchema)