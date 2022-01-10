import React from "react";
import User from "../user/User";

import '../button/Button.css';

import './Header.css';
import './__menu/HeaderMenu.css';

class Header extends React.Component {
    render() {
        return (
            <header className="header">
                <button className="button" type="button">
                    <User/>
                </button>
                <ul className="header__menu">
                    <li className="header__menu-item">
                        <button className="button" type="button">
                            Категории
                        </button>
                    </li>
                    <li className="header__menu-item">
                        <button className="button" type="button">
                            Приход/Расход
                        </button>
                    </li>
                </ul>
            </header>
        )
    }
}

export default Header;