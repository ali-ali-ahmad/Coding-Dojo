const mongoose = require("mongoose");

const JokeSchema = new mongoose.Schema({
	setup: String,
	punchLine: String
}, {timeStamps: true});

const Joke = mongoose.model("Joke", JokeSchema);

module.exports = Joke;