import {Component} from "react";
import {Analytics} from "../analytics/Analytics";
import {Category} from "../category/Category";
import {Chevron} from "../chevron/Chevron";
import {Payment} from "../payment/Payment";
import {Report} from "../report/Report";
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
                {id: 1, name: "ПЛАТЕЖИ", icon: paymentIcon, content: <Payment/>},
                {id: 2, name: "КАТЕГОРИИ", icon: categoryIcon, content: <Category/>},
                {id: 3, name: "ОТЧЕТЫ", icon: reportIcon, content: <Report/>},
                {id: 4, name: "АНАЛИТИКА", icon: analyticsIcon, content: <Analytics/>},
            ]
        }
    }

    render() {
        let navItems = this.state.menuItems.map(value =>
            <NavItem icon={value.icon}
                     text={value.name}
                     content={value.content}
                     textVisible={this.state.visible}
                     setMainContent={this.props.setMainContent}
                     key={value.id}
            />
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