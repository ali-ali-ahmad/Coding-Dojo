const { faker } = require('@faker-js/faker');
const express = require("express");
const app = express();


const createUser = () => {
    const newUser = {
        _id:faker.datatype.uuid(),
        firstName: faker.name.firstName(),
        lastName: faker.name.lastName(),
        email: faker.internet.email(),
        password: faker.internet.password(),
        phoneNumber: faker.phone.number(),
    };
    return newUser;
};
const createCompany = () => {
    const newCompany = {
        _id:faker.datatype.uuid(),
        name: faker.company.name(),
        address:{
            street:faker.address.street(),
            city:faker.address.cityName(),
            state:faker.address.state(),
            zipCode:faker.address.zipCode(),
            country:faker.address.country()
        },
    };
    return newCompany;
};

app.get("/api", (req, res) => {
    res.json(createUser())
    res.send("Our express api server is now sending this over to the browser");
});

const server = app.listen(8000, () =>
    console.log(`Server is locked and loaded on port ${server.address().port}!`)
);

app.post("/api/users",(req,res)=>{
    console.log(req.body);
    users.push(req.body);
    // we always need to respond with something
    res.json( { status: "ok" } );
});

app.get("/api/company" ,(req,res)=>{
    res.json( createCompany())
})

app.get("/api/user/" ,(req,res)=>{
    res.json(createUser())
})

app.get("/api/user/company" ,(req,res)=>{
    var va1 ={
        user:createUser() ,
        company:createCompany()
    }
    res.json(va1);
})

app.get("/api/users/:id", (req, res) => {
  // we can get this `id` variable from req.params
    console.log(req.params.id);
    console.log(users[users.length-1].firstName)

    // assuming this id is the index of the users array we could return one user this way
    res.json( users[req.params.id] );
});

const newuser = createUser();
console.log(newuser);

const newcompany = createCompany();
console.log(newcompany);