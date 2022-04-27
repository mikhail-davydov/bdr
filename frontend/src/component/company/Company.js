import {Component} from "react";
import {Chevron} from "../chevron/Chevron";

import "./Company.css";

class Company extends Component {

    render() {
        let visibleCompany = this.props.companies.find(company => company.isVisible);
        return (
            <div className="company-container" onClick={this.props.onClick}>
                <div className="company">
                    <div className="company__text">
                        {visibleCompany.name}
                    </div>
                    <div className="company__chevron-container">
                        <Chevron chevronDirectionClass={this.getChevronDirectionClass()}
                                  isVisible={this.isChevronVisible()}/>
                    </div>
                </div>
            </div>
        )
    }

    isChevronVisible() {
        return (this.props.companies.length !== 1);
    }

    getChevronDirectionClass() {
        return this.props.chevronUp ? "chevron--up" : "chevron--down";
    }

}

export default Company;