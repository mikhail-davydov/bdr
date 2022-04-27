import {Component} from "react";
import {Chevron} from "../chevron/Chevron";
import {NavItem} from "./__item/NavItem";
import {NavList} from "./__list/NavList";

import "./Nav.css";
import {analyticsIcon, categoryIcon, paymentIcon, reportIcon} from "./NavItemsIcons";

export class Nav extends Component {

    constructor(props) {
        super(props);
        this.onClick = this.onClick.bind(this);
        this.state = {
            visible: false,
            menuItems: [
                {id: 1, name: "ПЛАТЕЖИ", content: paymentIcon},
                {id: 2, name: "КАТЕГОРИИ", content: categoryIcon},
                {id: 3, name: "ОТЧЕТЫ", content: reportIcon},
                {id: 4, name: "АНАЛИТИКА", content: analyticsIcon},
            ]
        }
    }

    render() {
        let navItems = this.state.menuItems.map(value =>
            <NavItem icon={value.content} text={value.name} textVisible={this.state.visible} key={value.id}/>
        );

        return (
            <nav className={this.getNavContainerClassName()}>
                <div className="nav__chevron-container" onClick={this.onClick}>
                    <Chevron chevronDirectionClass={this.getChevronDirectionClass()}/>
                </div>
                <NavList items={navItems}/>
            </nav>
        );
    }

    onClick() {
        this.setState({
            visible: !this.state.visible,
        })
    }

    getNavContainerClassName() {
        return (this.state.visible) ?
            "nav-container visible" :
            "nav-container";
    }

    getChevronDirectionClass() {
        return (this.state.visible) ? "chevron--left" : "chevron--right";
    }

}