import {Component} from "react";
import {AnalyticsTab} from "../analytics-tab/AnalyticsTab";
import {CategoriesTab} from "../categories-tab/CategoriesTab";
import {Chevron} from "../chevron/Chevron";
import {PaymentsTab} from "../payments-tab/PaymentsTab";
import {ReportsTab} from "../reports-tab/ReportsTab";
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
                {id: 1, name: "платежи", icon: paymentIcon, content: <PaymentsTab/>},
                {id: 2, name: "категории", icon: categoryIcon, content: <CategoriesTab/>},
                {id: 3, name: "отчеты", icon: reportIcon, content: <ReportsTab/>},
                {id: 4, name: "аналитика", icon: analyticsIcon, content: <AnalyticsTab/>},
            ]
        }
    }

    render() {
        let navItems = this.state.menuItems.map(value =>
            <NavItem icon={value.icon}
                     text={value.name.toUpperCase()}
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