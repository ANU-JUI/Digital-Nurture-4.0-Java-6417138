export default class Office{
    constructor(name,rent,location,img){
        this.name = name;
        this.rent = rent;
        this.location = location;
        this.img = img;
    }
    getName(){
        return this.name;
    }
    getRent(){
        return this.rent;
    }
    getLocation(){
        return this.location;
    }
    getImg(){
        return this.img;
    }
    setName(name){
        this.name = name;
    }

    setRent(rent){
        this.rent = rent;
    }

    setLocation(location){
        this.location = location;
    }
}