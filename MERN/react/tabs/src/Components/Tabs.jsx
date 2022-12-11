
import React, { useState } from 'react';

const Tabs = ({ items }) => {

    const [activeTab, setActiveTab] = useState(0);


    const style1 = {
        display: 'inline-table',
        justifyContent: 'center',
        alignItems: 'center',
    }


    const style2 ={
    backgroundColor: 'grey',
    border: '1px solid grey',
    borderRadius: '10px',
    transition: 'width 3s',
    }


    const style3 = {
        border: '1px solid grey',
        borderRadius: '10px',
        padding: '20px',
    }
    const style4 = {
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'center',
        marginTop: '200px',
    }


    const tabs = items.map((item, index) => {
        return (
            <div style={style1} key={index}>
                <button style={style2} onClick={() => setActiveTab(index)}>{item.label}</button>
                {activeTab === index && <div style={style3}>{item.content}</div>}
            </div>
        );
    });

    return <div style={style4}>{tabs}</div>;
};

export default Tabs;
