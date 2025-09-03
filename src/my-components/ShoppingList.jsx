  const items = [
    { id: 1, name: "Apple", price: 0.5 ,isFruit: true, id: 1},
    { id: 2, name: "Banana", price: 0.3 ,isFruit: false, id: 2},
    { id: 3, name: "Cherry", price: 0.8 ,isFruit: true, id: 3}
  ];
function ShoppingList() {
  const listItems = items.map(item => (
    <li key={item.id} style={{ color: item.isFruit ? "green" : "orange" }}>
      {item.name} - ${item.price.toFixed(2)} {item.isFruit ? "(Fruit)" : "(Vegetable)"}
    </li>
  ));
  return (
    <div>
      <h2>Shopping List</h2>
      <ul>
        {listItems}
      </ul>
    </div>
  );
}
export default ShoppingList;
