interface Events 
{
    name: string,
    state: string,
    start: number,
    end: number,
    maxPersons: number,
    Creator: string,
    free: boolean,
}

let newEvent2: Events = 
{
    name: "New Event",
    state: "New",
    start: 1,
    end: 2,
    maxPersons: 10,
    Creator: "Cristo",
    free: false,
}