import './Myuser.css';

function Myuser() {
  const user={
    name: "John Doe",
    age: 30,
    img: "https://i.imgur.com/yXOvdOSs.jpg"
  }
  return (
    <>
      <div>
        <img src={user.img} alt={user.name} className="avatar" />
        <h2>{user.name}</h2>
        <p>Age: {user.age}</p>
      </div>
    </>
  );
}

export default Myuser;
