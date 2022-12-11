import Tabs from './Components/Tabs';

const items = [
    {
        label: 'Tab 1',
        content: 'Tab 1 contect is showing here',
    },
    {
        label: 'Tab 2',
        content: 'Tab 2 contect is showing here',
    },
    {
        label: 'Tab 3',
        content: 'Tab 3 contect is showing here',
    },
];

function App() {
    
    return (
        <>
        <Tabs items={items} />
        </>
    );
}

export default App;



