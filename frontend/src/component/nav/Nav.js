import {Component} from "react";

import "./Nav.css";
import {analyticsIcon, categoryIcon, paymentIcon, reportIcon} from "./NavItems";

export class Nav extends Component {

    constructor(props) {
        super(props);
        this.state = {
            menuItems: [
                {id: 1, name: "ПЛАТЕЖИ", content: paymentIcon},
                {id: 2, name: "КАТЕГОРИИ", content: categoryIcon},
                {id: 3, name: "ОТЧЕТЫ", content: reportIcon},
                {id: 4, name: "АНАЛИТИКА", content: analyticsIcon},
            ]
        }
    }

    render() {
        let navListItems = this.state.menuItems.map(value =>
            <div className="nav__item-container" key={value.id}>
                <li className="nav__item icon">
                    {value.content}
                </li>
            </div>
        );

        return (
            <nav className="nav-container">
                <div className="nav__chevron-container">
                    <div className="nav__chevron-right"></div>
                </div>
                <ul className="nav__list">
                    {navListItems}
                </ul>
            </nav>
        )
    }

}