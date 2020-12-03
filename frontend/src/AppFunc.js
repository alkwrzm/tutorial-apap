import React, { useState } from "react";
import List from "./components/List";
import listMovies from "movies.json";
import "./App.css";
import EmptyState from './components/EmptyState';


function App() {
    const [favItems, setFavItems] = useState(() => []);
    const [newState, setNewState] = useState(false);

    function handleItemClick(item) {
        const newItems = [...favItems];
        const newItem = { ...item };
        const targetInd = newItems.findIndex(it => it.id === newItem.id);
        if (targetInd < 0) newItems.push(newItem);
        setFavItems(newItems);
    }

    function handleFavClick(item) {
        const newItems = [...favItems];
        const newItem = { ...item };
        const targetInd = newItems.findIndex(it => it.id === newItem.id);
        if (targetInd < 0) newItems.push(newItem);
        else newItems.splice(targetInd, 1);
        setFavItems(newItems);
    }

    function showFav() {
        setNewState(!newState);
    }

    function clearItemClick(){
        setFavItems([]);
    }

    let emptyState;
    if (favItems.length === 0) {
        emptyState = <EmptyState/>
    }


    return (
        <div className="container-fluid">
            <h1 className="text-center mt-3 mb-0">Favorites Movie App</h1>
            <p className="text-center text-secondary text-sm font-italic">
                (This is a <strong>function-based</strong> application)
            </p>
            <div className="container pt-3">
                <div className="d-flex justify-content-center align-items-center">
                    <label className="switch">
                        <input type="checkbox" onClick={showFav} />
                        <span className="slider round"></span>
                    </label>
                    <h4 className="fav-margin space">Show Favorites</h4>
                </div>
                <div className={`text-center ${favItems.length > 0 ? "d-block" : "d-none"}`}>
                    <div className="d-flex justify-content-center align-items-center">
                        <label>
                            <button className="btn btn-primary" onClick={clearItemClick}>Delete Favourites</button>
                        </label>
                    </div>
                </div>
                <div className="container pt-3">
                    <div className="row">
                        <div className="col-sm">
                            <List
                                title="List Movies"
                                items={listMovies}
                                onItemClick={handleItemClick}
                            />
                        </div>
                        <div className={`col-sm ${newState ? "d-block" : "d-none"}`}>
                            <List
                                title="My Favorites"
                                items={favItems}
                                onItemClick={handleFavClick}
                            />
                        </div>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default App;