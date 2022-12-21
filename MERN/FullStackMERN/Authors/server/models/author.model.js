const mongoose = require('mongoose');
const AuthorSchema = new mongoose.Schema({
    name: {
        type: String,
        minlength:3,
        required: true,
    },
}, {timestamps: true});
module.exports.Author = mongoose.model('Author', AuthorSchema)