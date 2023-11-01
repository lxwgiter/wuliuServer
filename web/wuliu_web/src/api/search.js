import axios from 'axios';


export async function getSupplier(name) {
    return  axios.get('http://localhost:8080/api/getSupplier?name='+name)
}