import axios from "axios";
const DATABASE_URL = "http://localhost:8080";

class weaponService {
  getAllWeapons = async () => {
    return axios.get(`${DATABASE_URL}/weapon`);
  };
}

export default new weaponService();
