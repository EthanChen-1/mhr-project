import React, { useEffect, useState } from "react";
import weaponService from "../../service/weaponService";

export default function Homepage() {
  const [weaponList, setWeaponList] = useState([]);

  useEffect(() => {
    weaponService.getAllWeapons().then((response) => {
      console.log(response.data);
      setWeaponList(response.data);
    });
  }, []);

  const formattedWeaponList = weaponList.map((weapon, index) => {
    return (
      <tr
        key={weapon.id}
        style={{
          listStyleType: "none",
          textAlign: "center",
          backgroundColor: "lightblue",
        }}
      >
        <td>{weapon.weaponName}</td>
        <td>{weapon.weaponDamage}</td>
        <td>{weapon.weaponAffinity}</td>
        <td>{weapon.elementalDamageType}</td>
        <td>{weapon.elementalDamage}</td>
      </tr>
    );
  });

  return (
    <table
      style={{
        width: "100%",
        margin: "auto",
        backgroundColor: "gray",
      }}
    >
      <thead style={{ backgroundColor: "" }}>
        <tr>
          <th>Name</th>
          <th>Damage</th>
          <th>Affinity</th>
          <th>Elemental Type</th>
          <th>Elemental Damage</th>
        </tr>
      </thead>
      <tbody>{formattedWeaponList}</tbody>
      <tfoot></tfoot>
    </table>
  );
}
