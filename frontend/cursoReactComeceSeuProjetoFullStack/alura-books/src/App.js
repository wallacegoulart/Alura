import './App.css';
import Logo from './componentes/Logo'
import perfil from './image/perfil.svg'
import sacola from './image/sacola.svg'


const textoListaItem =['CATEGORIAS','MINHA ESTANTE','FAVORITOS'];
const icone= [perfil,sacola]


function App() {
  return (
    <div className='App'>
      <header className='App-header'> 
        <Logo></Logo>
        
        <ul className='lista__primary'>
          {textoListaItem.map( (texto)=>(
            <li className='lista__item'><p>{texto}</p></li>
          ) )}
        </ul>
        
        <ul className='lista__secundaria'>
          {icone.map( (icone)=>(
            <li className='lista__item__icone'><p><img src={icone}></img></p></li>
          )  )}
        </ul>


      </header>
    </div>
  );
}

export default App;
